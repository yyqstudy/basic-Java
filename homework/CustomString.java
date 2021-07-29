package homework;
/*

5种方法
1、getString() - Returns the current string.
2、setString(String string) - Sets the value of the current string.

3、 remove(String arg) - Returns a new string version of the current string where the
alphabetical characters specified in the given arg, are removed.

4、 reverse(String arg) - 大小写反转
Returns a new string version of the current string where the
capitalization is reversed (i.e., lowercase to uppercase, and uppercase to lowercase) for
the alphabetical characters specified in the given arg.

//isUpperCase is true
boolean isUpperCase = Character.isUpperCase('T');
/isLowerCase is true
boolean isLowerCase = Character.isLowerCase('t');
char myChar = Character.toLowerCase('T');
char myChar = Character.toUpperCase('t');

5、 filterLetters(char n, boolean more) - Returns a new string version of the current string
   where all the letters either >= or <= the given char n, are removed.
   For example:
      char myChar1 = ‘s’; char myChar2 = ‘t’;
     //compared is true
     boolean compared = myChar1 < myChar2;
思路：

 */





/*
public class CustomString {
    public static void main(String[] args) {

    }


    public void setString(String string){
        //this.string = string;
    }
    public String getString(String string){
        return string;
    }
    public String remove(String arg){

    }
    public String reverse(String arg){
      //先分隔
        String myString ="hello";
        char [] arrayOfChars = myString.toCharArray();
        for (int i = 0; i < arrayOfChars.length; i++) {
            //判断是大写吗，如果true--转小写；如果false--转大写
            if(Character.isLetter(arrayOfChars[i])){
                System.out.println(Character.toUpperCase(arrayOfChars[i]));
            }else{
                System.out.println(Character.toLowerCase(arrayOfChars[i]));
            }
        }
    }

    public String filterLetters(char n, boolean more){
        //比较字母大小

    }

}

*/

