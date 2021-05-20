import java.util.*;

public class Code {
   
    private static Hashtable<String, String> dest_table = new Hashtable<String, String>(8);
    private static Hashtable<String, String> jump_table = new Hashtable<String, String>(8);
    private static Hashtable<String, String> comp_table = new Hashtable<String, String>(28);

    private static void init_dest_table() {
        dest_table.put("null", "000");
        dest_table.put("M", "001");
        dest_table.put("D", "010");
        dest_table.put("MD", "011");
        dest_table.put("A", "100");
        dest_table.put("AM", "101");
        dest_table.put("AD", "110");
        dest_table.put("AMD", "111");
    }
    private static void init_jump_table() {
        jump_table.put("null", "000");
        jump_table.put("JGT", "001");
        jump_table.put("JEQ", "010");
        jump_table.put("JGE", "011");
        jump_table.put("JLT", "100");
        jump_table.put("JNE", "101");
        jump_table.put("JLE", "110");
        jump_table.put("JMP", "111");
    }
    private static void init_comp_table() {
        comp_table.put("0", "0101010");
        comp_table.put("1", "0111111");
        comp_table.put("-1", "0111010");
        comp_table.put("D", "0001100");
        comp_table.put("A", "0110000");
        comp_table.put("!D", "0001101");
        comp_table.put("!A", "0110001");
        comp_table.put("-D", "0001111");
        comp_table.put("-A", "0110011");
        comp_table.put("D+1", "0011111");
        comp_table.put("A+1", "0110111");
        comp_table.put("D-1", "0001110");
        comp_table.put("A-1", "0110010");
        comp_table.put("D+A", "0000010");
        comp_table.put("D-A", "0010011");
        comp_table.put("A-D", "0000111");
        comp_table.put("D&A", "0000000");
        comp_table.put("D|A", "0010101");
        comp_table.put("M", "1110000");
        comp_table.put("!M", "1110001");
        comp_table.put("-M", "1110011");
        comp_table.put("M+1", "1110111");
        comp_table.put("M-1", "1110010");
        comp_table.put("D+M", "1000010");
        comp_table.put("D-M", "1010011");
        comp_table.put("M-D", "1000111");
        comp_table.put("D&M", "1000000");
        comp_table.put("D|M", "1010101");
    }
    public static String get_comp_code(final String key) {
        init_comp_table();
        return comp_table.get(key);
    }
    public static String get_dest_code(final String key) {
        init_dest_table();
        return dest_table.get(key);
    }
    public static String get_jump_code(final String key) {
        init_jump_table();
        return jump_table.get(key);
    }
}