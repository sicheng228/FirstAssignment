 

/**
 * Created by Yang on 1/23/20.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {
         return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        return array[array.length-1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        return array[array.length-2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        for(int i=0;i<array.length;i++){
        if (array[i]==value){
        return true;
        };
    }
        return false;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        for(int i=0;i<
        array.length/2; i++){
            String temp=array[i];
            array[i]=array[array.length-1-i];
            array[array.length-1-i]=temp;
        }
        return array;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        for(int i=0;i<array.length/2;i++){
        if (array[i]!=array[array.length-1-i]){
        return false;};
        }
        return true;
}

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        
    String alphabet= "abcdefghijklmnopqrstuvwxyz";
    String str=String.join("",array);
        for(int i=0;i<alphabet.length();i++){
 
                if (str.toLowerCase().indexOf(alphabet.charAt(i)) == -1){
                   return false; 
                }
            }
            return true;
    }


    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int count=0;
        for(int i=0; i<array.length;i++){
            if (array[i]==value){
            count+=1;
            }
        }
        return count;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        String[] newArray=new String[array.length-getNumberOfOccurrences(array,valueToRemove)];
        for(int i=0,j=0;i<array.length && i<array.length;i++,j++){
            if (valueToRemove==array[i]){
                j-=1;
            }
            if(valueToRemove!=array[i]){
                newArray[j]=array[i];
            }
        }
        return newArray;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        int pointer1=1;
        int pointer2=1;
        while(pointer2<array.length){
            if(array[pointer2]==array[pointer2-1]){
            pointer2++;
        }
            else {
            array[pointer1++]=array[pointer2];
            pointer2++;
            }
        }
        String[] newArray= new String[pointer1];
        for(int i=0; i<pointer1;i++){
        newArray[i]=array[i];
    }
        return newArray;
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        StringBuilder str= new StringBuilder();
        int pointer1=0;
        for(int pointer2=0; pointer2<array.length;pointer2++){
            while(pointer2<array.length-1 && array[pointer2]==array[pointer2+1]){
               str.append(array[pointer2]);
               pointer2++;
            } 
            str.append(array[pointer2]);
            array[pointer1++]=str.toString();
            str.delete(0,str.length());
            
        }
        String[] newArray= new String[pointer1];
        for(int i=0; i<pointer1;i++){
        newArray[i]=array[i];
    }
        return newArray;

    }
}
