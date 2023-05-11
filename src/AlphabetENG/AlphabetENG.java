package AlphabetENG;

public class AlphabetENG {
    private static final AlphabetENG A = new AlphabetENG('A');
    private static final AlphabetENG B = new AlphabetENG('B');
    private static final AlphabetENG C = new AlphabetENG('C');
    private static final AlphabetENG D = new AlphabetENG('D');
    private static final AlphabetENG E = new AlphabetENG('E');
    private static final AlphabetENG F = new AlphabetENG('F');
    private static final AlphabetENG G = new AlphabetENG('G');
    private static final AlphabetENG H = new AlphabetENG('H');
    private static final AlphabetENG I = new AlphabetENG('I');
    private static final AlphabetENG J = new AlphabetENG('J');
    private static final AlphabetENG K = new AlphabetENG('K');
    private static final AlphabetENG L = new AlphabetENG('L');
    private static final AlphabetENG M = new AlphabetENG('M');
    private static final AlphabetENG N = new AlphabetENG('N');
    private static final AlphabetENG O = new AlphabetENG('O');
    private static final AlphabetENG P = new AlphabetENG('P');
    private static final AlphabetENG Q = new AlphabetENG('Q');
    private static final AlphabetENG R = new AlphabetENG('R');
    private static final AlphabetENG S = new AlphabetENG('S');
    private static final AlphabetENG T = new AlphabetENG('T');
    private static final AlphabetENG U = new AlphabetENG('U');
    private static final AlphabetENG V = new AlphabetENG('V');
    private static final AlphabetENG W = new AlphabetENG('W');
    private static final AlphabetENG X = new AlphabetENG('X');
    private static final AlphabetENG Y = new AlphabetENG('Y');
    private static final AlphabetENG Z = new AlphabetENG('Z');
    private static final AlphabetENG a = new AlphabetENG('a');
    private static final AlphabetENG b = new AlphabetENG('b');
    private static final AlphabetENG c = new AlphabetENG('c');
    private static final AlphabetENG d = new AlphabetENG('d');
    private static final AlphabetENG e = new AlphabetENG('e');
    private static final AlphabetENG f = new AlphabetENG('f');
    private static final AlphabetENG g = new AlphabetENG('g');
    private static final AlphabetENG h = new AlphabetENG('h');
    private static final AlphabetENG i = new AlphabetENG('i');
    private static final AlphabetENG j = new AlphabetENG('j');
    private static final AlphabetENG k = new AlphabetENG('k');
    private static final AlphabetENG l = new AlphabetENG('l');
    private static final AlphabetENG m = new AlphabetENG('m');
    private static final AlphabetENG n = new AlphabetENG('n');
    private static final AlphabetENG o = new AlphabetENG('o');
    private static final AlphabetENG p = new AlphabetENG('p');
    private static final AlphabetENG q = new AlphabetENG('q');
    private static final AlphabetENG r = new AlphabetENG('r');
    private static final AlphabetENG s = new AlphabetENG('s');
    private static final AlphabetENG t = new AlphabetENG('t');
    private static final AlphabetENG u = new AlphabetENG('u');
    private static final AlphabetENG v = new AlphabetENG('v');
    private static final AlphabetENG w = new AlphabetENG('w');
    private static final AlphabetENG x = new AlphabetENG('x');
    private static final AlphabetENG y = new AlphabetENG('y');
    private static final AlphabetENG z = new AlphabetENG('z');
    private static final AlphabetENG POINT = new AlphabetENG('.');
    private static final AlphabetENG COMMA = new AlphabetENG(',');
    private static final AlphabetENG QUOTATION_MARK = new AlphabetENG('"');
    private static final AlphabetENG BACKSLASH = new AlphabetENG('\\');
    private static final AlphabetENG SLASH = new AlphabetENG('/');
    private static final AlphabetENG COLON = new AlphabetENG(':');
    private static final AlphabetENG SEMICOLON = new AlphabetENG(';');
    private static final AlphabetENG EXCLAMATION_MARK = new AlphabetENG('!');
    private static final AlphabetENG QUESTION_MARK = new AlphabetENG('?');
    private static final AlphabetENG SPACE = new AlphabetENG(' ');
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
