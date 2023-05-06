public class Sabaq_09 {
    public static void main(String[] args){
                String inputString = "This is a test string";
                char letterToReplace = 'i';
                int numberToReplaceWith = 5;

                String replacedString = inputString.replace(letterToReplace, Character.forDigit(numberToReplaceWith, 10));
                System.out.println("Input string: " + inputString);
                System.out.println("Replaced string: " + replacedString);
            }
        }
