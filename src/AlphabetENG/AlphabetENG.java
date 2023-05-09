package AlphabetENG;

public class AlphabetENG {
    public static final AlphabetENG A = new AlphabetENG('A');
    public static final AlphabetENG B = new AlphabetENG('B');
    public static final AlphabetENG C = new AlphabetENG('C');
    public static final AlphabetENG D = new AlphabetENG('D');
    public static final AlphabetENG E = new AlphabetENG('E');
    public static final AlphabetENG F = new AlphabetENG('F');
    public static final AlphabetENG G = new AlphabetENG('G');
    public static final AlphabetENG H = new AlphabetENG('H');
    public static final AlphabetENG I = new AlphabetENG('I');
    public static final AlphabetENG J = new AlphabetENG('J');
    public static final AlphabetENG K = new AlphabetENG('K');
    public static final AlphabetENG L = new AlphabetENG('L');
    public static final AlphabetENG M = new AlphabetENG('M');
    public static final AlphabetENG N = new AlphabetENG('N');
    public static final AlphabetENG O = new AlphabetENG('O');
    public static final AlphabetENG P = new AlphabetENG('P');
    public static final AlphabetENG Q = new AlphabetENG('Q');
    public static final AlphabetENG R = new AlphabetENG('R');
    public static final AlphabetENG S = new AlphabetENG('S');
    public static final AlphabetENG T = new AlphabetENG('T');
    public static final AlphabetENG U = new AlphabetENG('U');
    public static final AlphabetENG V = new AlphabetENG('V');
    public static final AlphabetENG W = new AlphabetENG('W');
    public static final AlphabetENG X = new AlphabetENG('X');
    public static final AlphabetENG Y = new AlphabetENG('Y');
    public static final AlphabetENG Z = new AlphabetENG('Z');
    public static final AlphabetENG a = new AlphabetENG('a');
    public static final AlphabetENG b = new AlphabetENG('b');
    public static final AlphabetENG c = new AlphabetENG('c');
    public static final AlphabetENG d = new AlphabetENG('d');
    public static final AlphabetENG e = new AlphabetENG('e');
    public static final AlphabetENG f = new AlphabetENG('f');
    public static final AlphabetENG g = new AlphabetENG('g');
    public static final AlphabetENG h = new AlphabetENG('h');
    public static final AlphabetENG i = new AlphabetENG('i');
    public static final AlphabetENG j = new AlphabetENG('j');
    public static final AlphabetENG k = new AlphabetENG('k');
    public static final AlphabetENG l = new AlphabetENG('l');
    public static final AlphabetENG m = new AlphabetENG('m');
    public static final AlphabetENG n = new AlphabetENG('n');
    public static final AlphabetENG o = new AlphabetENG('o');
    public static final AlphabetENG p = new AlphabetENG('p');
    public static final AlphabetENG q = new AlphabetENG('q');
    public static final AlphabetENG r = new AlphabetENG('r');
    public static final AlphabetENG s = new AlphabetENG('s');
    public static final AlphabetENG t = new AlphabetENG('t');
    public static final AlphabetENG u = new AlphabetENG('u');
    public static final AlphabetENG v = new AlphabetENG('v');
    public static final AlphabetENG w = new AlphabetENG('w');
    public static final AlphabetENG x = new AlphabetENG('x');
    public static final AlphabetENG y = new AlphabetENG('y');
    public static final AlphabetENG z = new AlphabetENG('z');
    public static final AlphabetENG POINT = new AlphabetENG('.');
    public static final AlphabetENG COMMA = new AlphabetENG(',');
    public static final AlphabetENG QUOTATION_MARK = new AlphabetENG('"');
    public static final AlphabetENG BACKSLASH = new AlphabetENG('\\');
    public static final AlphabetENG SLASH = new AlphabetENG('/');
    public static final AlphabetENG COLON = new AlphabetENG(':');
    public static final AlphabetENG SEMICOLON = new AlphabetENG(';');
    public static final AlphabetENG EXCLAMATION_MARK = new AlphabetENG('!');
    public static final AlphabetENG QUESTION_MARK = new AlphabetENG('?');
    public static final AlphabetENG SPACE = new AlphabetENG(' ');
    private static final AlphabetENG[] values = {A, B, C, D, E, POINT, F, G, H, I, J, COMMA, K, L, M, N, O, QUOTATION_MARK, P, Q, R, S, T,
            BACKSLASH, U, V, W, X, Y, SLASH, Z, a, b, c, d, COLON, e, f, g, h, i, SEMICOLON, j, k, l, m, n, EXCLAMATION_MARK, o, p, q, r, s,
            QUESTION_MARK, t, u, v, w, x, y, SPACE, z};
    private final char value;

    private AlphabetENG(char value) {
        this.value = value;
    }

    public char ordinal() {
        return this.value;
    }

    public static AlphabetENG[] values() {
        return values;
    }

    @Override
    public String toString() {
        return String.valueOf(this.value);
    }
}
