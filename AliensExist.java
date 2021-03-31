// "Draws" the image below
//      ___
//  ___/8.8\___  Aliens Exist == true
// /   '---'   \
// '--_______--'
//      / \
//     /   \
//     /\O/\
//     / | \
//     // \\
// 1111111111111

public class AliensExist{
    public static void main(String[] args) {
        System.out.println(String.format("%s", "     ___"));
        System.out.println(String.format("%s%3.1f%s %b", " ___/", 8.8, "\\___  Aliens Exist ==", true));
        System.out.println(String.format("%s", "/   '---'   \\"));
        System.out.println(String.format("%s", "'--_______--'"));
        System.out.println(String.format("%s", "     / \\"));
        System.out.println(String.format("%s", "    /   \\"));
        System.out.println(String.format("%s", "    /\\O/\\"));
        System.out.println(String.format("%s", "    / | \\"));
        System.out.println(String.format("%s", "    // \\\\"));
        System.out.println(String.format("%1$d%1$d%1$d%1$d%1$d%1$d%1$d%1$d%1$d%1$d%1$d%1$d%1$d", 1));
    }
}