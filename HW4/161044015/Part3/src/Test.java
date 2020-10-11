import java.util.Stack;

/**
 * This is my Test class which I tested all of methods.
 */
public class Test {

    public static void main(String[] args)
    {
        Part3 testRecursiveMethods = new Part3();

        System.out.println();
        System.out.println("======================Test 1. Question===================");
        System.out.println();
        System.out.println("=========================================================");
        String str = "this function writes the sentence in reverse";
        System.out.println("String is: " + str);
        System.out.println();
        System.out.print("Reverse it: " );
        testRecursiveMethods.recursiveStringReversing(str);
        System.out.println();
        System.out.println("=========================================================");
        System.out.println();
        str = "dont give in without a fight";
        System.out.println();
        System.out.println("=========================================================");
        System.out.println("String is: " + str);
        System.out.println();
        System.out.print("Reverse it: " );
        testRecursiveMethods.recursiveStringReversing(str);
        System.out.println();
        System.out.println("=========================================================");
        System.out.println();
        System.out.println();
        System.out.println("======================Test 2. Question===================");

        System.out.println();
        str = "whiteleaf";
        System.out.println("=========================================================");
        System.out.println("String is: " + str);
        System.out.println();
        testRecursiveMethods.elfishRecursive(str);
        System.out.println("=========================================================");
        System.out.println();

        str = "tasteful";
        System.out.println("=========================================================");
        System.out.println("String is: " + str);
        System.out.println();
        testRecursiveMethods.elfishRecursive(str);
        System.out.println("=========================================================");
        System.out.println();

        str = "unfriendly";
        System.out.println("=========================================================");
        System.out.println("String is: " + str);
        System.out.println();
        testRecursiveMethods.elfishRecursive(str);
        System.out.println("=========================================================");
        System.out.println();

        str = "waffles";
        System.out.println("=========================================================");
        System.out.println("String is: " + str);
        System.out.println();
        testRecursiveMethods.elfishRecursive(str);
        System.out.println("=========================================================");
        System.out.println();

        str = "paingoes";
        System.out.println("=========================================================");
        System.out.println("String is: " + str);
        System.out.println();
        testRecursiveMethods.elfishRecursive(str);
        System.out.println("=========================================================");
        System.out.println();

        str = "gloryremains";
        System.out.println("=========================================================");
        System.out.println("String is: " + str);
        System.out.println();
        testRecursiveMethods.elfishRecursive(str);
        System.out.println("=========================================================");
        System.out.println();

        System.out.println();
        System.out.println("======================Test 3. Question===================");
        System.out.println();

        int [] arr = {14, 17, 11, 12, 18, 19, 15, 16, 13};

        System.out.println("=========================================================");
        System.out.println("==================Array before sorting===================");

        testRecursiveMethods.printArray(arr,arr.length,0);
        System.out.println();

        System.out.println("==================Array after sorting====================");

        testRecursiveMethods.recursiveSelectionSort(arr, arr.length, 0);

        testRecursiveMethods.printArray(arr,arr.length,0);
        System.out.println();

        System.out.println("=========================================================");

        System.out.println();

        int [] arr2  = {2, 1, 5, 6, 0, 8, 5, 7, 9, 12, 10, 11};

        System.out.println("=========================================================");
        System.out.println("==================Array before sorting===================");

        testRecursiveMethods.printArray(arr2,arr2.length,0);
        System.out.println();

        System.out.println("==================Array after sorting====================");

        testRecursiveMethods.recursiveSelectionSort(arr2, arr2.length, 0);

        testRecursiveMethods.printArray(arr2,arr2.length,0);
        System.out.println();

        System.out.println("=========================================================");

        System.out.println();
        System.out.println();
        System.out.println("======================Test 4. Question===================");
        System.out.println();
        System.out.println("===============Evaluate PreFix Expression================");
        System.out.println();
        System.out.println("=========================================================");

        Stack<Integer> stack3 = new Stack<>();
        String expressionPre = "-*+4827";

        System.out.println("Prefix Expression is: "+ expressionPre);

        System.out.print("Result is: ");

        System.out.println(testRecursiveMethods.recursivePrefixEvaluate(stack3, expressionPre, expressionPre.length()-1));
        System.out.println("=========================================================");
        System.out.println();

        Stack<Integer> stack4 = new Stack<>();
        expressionPre = "-/*2+4653";
        System.out.println("Prefix Expression is: "+ expressionPre);

        System.out.print("Result is: ");

        System.out.println(testRecursiveMethods.recursivePrefixEvaluate(stack4, expressionPre, expressionPre.length()-1));
        System.out.println("=========================================================");
        System.out.println();
        System.out.println();

        System.out.println("======================Test 5. Question===================");
        System.out.println();
        System.out.println("===============Evaluate PostFix Expression===============");
        System.out.println();
        System.out.println("=========================================================");


        Stack<Integer> stack = new Stack<>();
        String expression = "246*+";

        System.out.println("Postfix Expression is: "+ expression);

        System.out.print("Result is: ");
        System.out.println(testRecursiveMethods.recursivePostfixEvaluate(stack, expression, expression.length(),0));
        System.out.println("=========================================================");
        System.out.println();

        System.out.println("=========================================================");

        Stack<Integer> stack2 = new Stack<>();

        expression = "42+352-*+";

        System.out.println("Postfix Expression is: "+ expression);

        System.out.print("Result is: ");
        System.out.println(testRecursiveMethods.recursivePostfixEvaluate(stack2, expression, expression.length(),0));
        System.out.println("=========================================================");

    }
}
