import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        Map<String, Integer> pokemon = new HashMap<>();
        ArrayList<String> pokemonArr = new ArrayList<>();

        for(int i = 0; i<n; i++) {
            String str = br.readLine();
            pokemon.put(str, i+1);
            pokemonArr.add(str);
        }

        for(int i = 0; i<m; i++) {
            String str = br.readLine();
            boolean check = str.matches("[0-9]+");
            if(check) {
                System.out.println(pokemonArr.get(Integer.parseInt(str)-1));
            } else {
                System.out.println(pokemon.get(str));
            }
        }

    }
}
