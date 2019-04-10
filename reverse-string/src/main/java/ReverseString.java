class ReverseString {

    String result;

    String reverse(String inputString) {
        if (inputString == "") {
            return "";
        } else {
            for (int i = inputString.length(); i >= 0; i--) {
                result = result + inputString.charAt(i);
            }

            return result;

            /**
             * Do i need to use built in functions?
             */
            // return new StringBuilder(inputString).reverse().toString();

            /**
             * String reversed = str.chars() .collect(StringBuilder::new, (b,c) ->
             * b.insert(0,(char)c), (b1,b2) -> b1.insert(0, b2)) .toString();
             */
        }

    }
}