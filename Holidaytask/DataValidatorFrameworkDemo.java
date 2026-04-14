import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Main class
public class DataValidatorFrameworkDemo {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter Your Name:");
        String name = sc.next();
        System.out.println("Enter Your age:");
        int age = sc.nextInt();
        System.out.println("Enter Your Email:");
        String email =sc.next();

        // Create validator
        Validator validator = new Validator();

        // Add rules
        validator.addRule(new RequiredStringRule("Name", name));
        validator.addRule(new AgeRangeRule("Age", age, 18, 30));
        validator.addRule(new EmailRule("Email", email));

        // Validate
        List<String> errors = validator.validate();

        // Print result
        if (errors.isEmpty()) {
            System.out.println("All data is valid.");
        } else {
            System.out.println("Validation Errors:");
            for (String error : errors) {
                System.out.println("- " + error);
            }
        }
        sc.close();
    }
}

// Common interface for all validation rules
interface ValidationRule {
    String validate();
}

// Rule 1: Check required string
class RequiredStringRule implements ValidationRule {
    private String fieldName;
    private String value;

    public RequiredStringRule(String fieldName, String value) {
        this.fieldName = fieldName;
        this.value = value;
    }

    @Override
    public String validate() {
        if (value == null || value.trim().isEmpty()) {
            return fieldName + " is required.";
        }
        return null;
    }
}

// Rule 2: Check age range
class AgeRangeRule implements ValidationRule {
    private String fieldName;
    private int value;
    private int min;
    private int max;

    public AgeRangeRule(String fieldName, int value, int min, int max) {
        this.fieldName = fieldName;
        this.value = value;
        this.min = min;
        this.max = max;
    }

    @Override
    public String validate() {
        if (value < min || value > max) {
            return fieldName + " must be between " + min + " and " + max + ".";
        }
        return null;
    }
}

// Rule 3: Check email format
class EmailRule implements ValidationRule {
    private String fieldName;
    private String value;

    public EmailRule(String fieldName, String value) {
        this.fieldName = fieldName;
        this.value = value;
    }

    @Override
    public String validate() {
        if (value == null || !value.contains("@") || !value.contains(".")) {
            return fieldName + " is not a valid email.";
        }
        return null;
    }
}

// Validator class
class Validator {
    private List<ValidationRule> rules;

    public Validator() {
        rules = new ArrayList<>();
    }

    public void addRule(ValidationRule rule) {
        rules.add(rule);
    }

    public List<String> validate() {
        List<String> errors = new ArrayList<>();

        for (ValidationRule rule : rules) {
            String result = rule.validate();
            if (result != null) {
                errors.add(result);
            }
        }

        return errors;
    }
}