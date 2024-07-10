class learn {
    public static void main(String arg[]) {
        // Literals : -Any constant value which can be assigned to the variable is called literal.

        byte data = -13; // -128 - 128
        long data1 = 435435347890l; // After int range , need to specify
        float num = 635.6f; // Have to specify
        double num1 = 5.4373894; // By default in Java
        char c = 't'; // Not "" and length > 1
        boolean b = true; // Not 0,1 like cpp

        int data2 = (int) num; // Typecasting
        data = (byte) data2; // data2 % range of byte(256)
        System.out.println(data);
    }
}

/*
 * integer ---byte(1 byte), short(2 byte), int(4 byte), long(8 byte)
 * float --- float(4 byte) , double(8 byte)
 * character ---char(2 byte)
 * boolean --- boolean(1 byte)
 */