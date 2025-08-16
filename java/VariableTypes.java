public class VariableTypes {
    public static void main(String[] args) {
        Integer playerHealth = 100;
        Boolean playerHasMagic = true;

        System.out.println("playerHealth is a/an "+ playerHealth.getClass().getName());
        System.out.println("playerHasMagic is a/an "+playerHasMagic.getClass().getName());
    }
}
