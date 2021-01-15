
class leetcodeStringToInteger {

    public static void main(String[] args) {
        String s = "-42";
        leetcodeStringToInteger r = new leetcodeStringToInteger();
        int result = r.myAtoi(s);
        System.out.println(result);

        String s2 = "ghdhhsjs";
        leetcodeStringToInteger r2 = new leetcodeStringToInteger();
        int result2 = r2.myAtoi(s2);
        System.out.println(result2);

        String s3 = "-91283472332";
        leetcodeStringToInteger r3 = new leetcodeStringToInteger();
        int result3 = r3.myAtoi(s3);
        System.out.println(result3);

        String s4 = "";
        leetcodeStringToInteger r4 = new leetcodeStringToInteger();
        int result4 = r4.myAtoi(s4);
        System.out.println(result4);
    }

    public int myAtoi(String s) {

        // retirar espacos

        s = s.trim();

        // variaveis

        String numerico = "0123456789";
        boolean semLetra = true;
        String resp = "";
        int i = 0;
        int sinal = 1;
        int respInt = 0;

        // se s estiver vazio

        if (s.isEmpty()) {
            return 0;
        }

        // avaliacao dos sinais

        if (s.charAt(0) == '-') {
            sinal = -1;
            i = 1;
        }
        if (s.charAt(0) == '+') {
            i = 1;
        }

        // avaliacao dos numeros

        while (semLetra && i < s.length()) {
            boolean var = numerico.contains(s.substring(i, i + 1));
            if (var) {
                resp = resp + s.substring(i, i + 1);
                i = i + 1;
            } else {
                semLetra = false;
            }

        }

        // avaliacao dos tamanhos

        if (resp == "") {
            respInt = 0;
        } else {
            if (sinal == -1) {
                try {
                    respInt = Integer.parseInt(resp) * sinal;
                } catch (NumberFormatException e) {
                    respInt = -2147483648;
                }
            }

            if (sinal == 1) {
                try {
                    respInt = Integer.parseInt(resp);
                } catch (NumberFormatException e) {
                    respInt = 2147483647;
                }
            }

        }

        return respInt;

    }
}