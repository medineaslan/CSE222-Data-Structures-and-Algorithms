import java.util.Stack;

/**
 * This is my Part3 class which I implemented part3s' recursive methods.
 */
public class Part3 {

    /**
     * Call helperRecursiveStringReversing.
     * @param str is string which will be spliting according to space character.
     */
    public void recursiveStringReversing(String str)
    {
        String[] arrayOfString = str.split(" ");
        helperRecursiveStringReversing(arrayOfString, arrayOfString.length - 1);
    }

    /**
     * This method reverse string recursively.
     * @param arrayOfString is a string array which will be reverse.
     * @param size size of arrayOfString.
     */
    private void helperRecursiveStringReversing(String [] arrayOfString, int size)
    {
        if(size < 0)
            return;
        else
        {
            if(size != 0)
                System.out.print(arrayOfString[size] + " ");
            else
                System.out.print(arrayOfString[size]);

            size = size  - 1;
            helperRecursiveStringReversing(arrayOfString, size);
        }
    }

    /**
     * Call elfishHelperRecursive.
     * @param str which will control is elfish or not.
     */
    public void elfishRecursive(String str)
    {
        boolean [] arr =  {false, false, false};
        elfishHelperRecursive(str, arr, 0);
    }

    /**
     * This method checks if given string is elfish or not.
     * @param word which will control elfish or not.
     * @param checkArr is a array for chechking.
     * @param index keeps current index.
     */
    private void elfishHelperRecursive(String word, boolean [] checkArr, int index)
    {
        if(index == word.length())
        {
            if(checkArr[0] && checkArr[1] && checkArr[2])
                System.out.println("This is elfish word.");
            else
                System.out.println("This is not elfish word.");
            return;
        }
        else
        {
            if(word.charAt(index) == 'e')
                checkArr[0] = true;
            else if(word.charAt(index) == 'l')
                checkArr[1] = true;
            else if(word.charAt(index) == 'f')
                checkArr[2] = true;

            elfishHelperRecursive(word, checkArr, ++index);
        }
    }

    /**
     * This method find minimum index of array for selection sort recursively.
     * @param arr is a array which will search its minimum index.
     * @param size size of array.
     * @param index keeps current index.
     * @return mimimum index of array.
     */
    public int findMinIndex(int [] arr, int size ,int index)
    {
        int tempMin;

        if(index == size)
            return index;

        tempMin = findMinIndex(arr, size, index+1);

        if(arr[tempMin] > arr[index])
            return index;
        else
            return tempMin;
    }

    /**
     * This method swaps given indexs of array.
     * @param arr array its indexs will swap.
     * @param index1 first index.
     * @param index2 other index.
     */
    public void swapValues(int [] arr, int index1, int index2)
    {
        int temp;

        temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    /**
     * This method sort array element using selection sort recursively.
     * @param arr array which will sort.
     * @param size size of array.
     * @param index keeps current index.
     */
    public void recursiveSelectionSort(int [] arr, int size, int index)
    {
        int minIndex;

        if(index == size)
            return;

        minIndex = findMinIndex(arr, size-1, index);

        if(minIndex != index)
            swapValues(arr, minIndex, index);

        recursiveSelectionSort(arr, size, index+1);

    }

    /**
     * This method prints array recursively for test selection sort.
     * @param arr array which will printed.
     * @param size size of given array.
     * @param index keeps current index.
     */
    public void printArray(int [] arr, int size, int index)
    {

        if(index >= size)
            return;

        System.out.print(arr[index]+" ");

        printArray(arr, size, index+1);

    }

    /**
     * This method evaluate postfix expression recursively.
     * @param stack keeps operators and numbers.
     * @param expression is a postfix expression.
     * @param size size of expression.
     * @param index keeps current index.
     * @return result of postfix expression.
     */
    public int recursivePostfixEvaluate(Stack <Integer> stack, String expression, int size, int index)
    {
        if(index == size)
            return stack.pop();

        if (Character.isDigit(expression.charAt(index)))
            stack.push(expression.charAt(index) - '0');

        else
        {
            int number1 = stack.pop();

            int number2 = stack.pop();

            char ch = expression.charAt(index);

            switch (ch) {
                case '+':
                    stack.push(number2 + number1);
                    break;
                case '-':
                    stack.push(number2 - number1);
                    break;
                case '*':
                    stack.push(number2 * number1);
                    break;
                case '/':
                    stack.push(number2 / number1);
                    break;
                default :
                    System.out.println("Wrong operation.");
            }
        }
        return recursivePostfixEvaluate(stack, expression,expression.length(),index+1);
    }

    /**
     * This method evaluate prefix expression recursively.
     * @param stack keeps operators and numbers.
     * @param expression is a prefix expression.
     * @param index keeps current index.
     * @return result of prefix expression.
     */
    public int recursivePrefixEvaluate(Stack <Integer> stack, String expression, int index)
    {
        if(index < 0)
            return stack.pop();

        if (Character.isDigit(expression.charAt(index)))
            stack.push(expression.charAt(index) - '0');
        else
        {
            int number1 = stack.pop();

            int number2 = stack.pop();

            char ch = expression.charAt(index);

            switch (ch) {
                case '+':
                    stack.push(number1 + number2);
                    break;
                case '-':
                    stack.push(number1 - number2);
                    break;
                case '*':
                    stack.push(number1 * number2);
                    break;
                case '/':
                    stack.push(number1 / number2);
                    break;
                default :
                    System.out.println("Wrong operation.");
            }
        }
        return recursivePrefixEvaluate(stack, expression,index-1);
    }
}
