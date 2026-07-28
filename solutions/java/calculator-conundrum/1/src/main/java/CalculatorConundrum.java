class CalculatorConundrum {
    public String calculate(int operand1, int operand2, String operation) {
        int result = 0;
        
        if (operation == null){
            //fuck i used .equals
            throw new IllegalArgumentException("Operation cannot be null");
        }
        
        if (operation.isEmpty()){
            throw new IllegalArgumentException("Operation cannot be empty");
        }
        
        if (!operation.equals("+") && !operation.equals("/") && !operation.equals("*")){
            throw new IllegalOperationException("Operation '" + operation + "' does not exist");
        }

        if (operation.equals("+")){
            result = operand1 + operand2;
            String equation = operand1 + " + "  + operand2 + " = " + result;
            return equation;
        }
        else if (operation.equals("*")){
            result = operand1 * operand2;
            String equation = operand1 + " * " + operand2 + " = " + result;
            return equation;
        }

        else if (operation.equals("/")) {
            try {    
                result = operand1 / operand2;
                String equation = operand1 + " / " + operand2 + " = " + result;
                return equation;
            }
            catch (ArithmeticException e){
                throw new IllegalOperationException("Division by zero is not allowed", e); //markiplier e meme
            }
        }
        else {
            return "Try again";
            //default
        }    
    }
}
