//Учитывая входную строку s, измените порядок слов в обратном порядке.
//Слово определяется как последовательность символов, не содержащих пробелов.
//Слова в s будут разделены по крайней мере одним пробелом.
//Возвращает строку слов в обратном порядке, объединенную одним пробелом.
//Обратите внимание, что s может содержать начальные или конечные пробелы или несколько пробелов между двумя словами.
//Возвращаемая строка должна содержать только один пробел, разделяющий слова. Не включайте никаких дополнительных пробелов.
//Example 1:
//Input: s = "the sky is blue"
//Output: "blue is sky the"

package org.example.Seminar1.HW1;

public class reverseWords {
    public static void main(String[] args) {
        String list = "the sky is blue";
        System.out.println(revStr(list));
    }
    public static String revStr(String words) {
        String result = "";
        String[] arr = words.split(" ");
        for (int i = arr.length-1; i >= 0 ; i--) {
            result += arr[i] + " ";
        }
        return result;
    }

}
