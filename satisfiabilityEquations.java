public class satisfiabilityEquations {
    static int uf[];
    public static boolean equationsPossible(String[] equations) {
        uf = new int[26];
        for(int i=0;i<26;i++)
            uf[i] = i;

        for(String e: equations)
            if(e.charAt(1) == '='){
                int p1 = find(e.charAt(0) - 'a');
                int p2 = find(e.charAt(3) - 'a');

                if(p1!=p2)
                    uf[p2] = p1;
            }

        for(String e:equations)
            if(e.charAt(1) == '!'){
                int p1 = find(e.charAt(0) - 'a');
                int p2 = find(e.charAt(3) - 'a');

                if(p1==p2)
                    return false;
            }

        return true;

    }

    public static int find(int x){
        return uf[x] == x ? x : find(uf[x]);
    }
    public static void main(String[] args) {
        String[] equations ={"a==b","b!=a","a==c"};
        System.out.println(equationsPossible(equations));
    }
}
