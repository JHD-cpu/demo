import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;

public class TestMain  {

    @Test
    public void test(){
        int[][] a= {{7,1,4,5,6},{2,5,1,6,4},{1,5,4,3,2},{1,2,7,3,4}};
        get(a );
    }

    public int get(int[][] p){
        int k = 0;

        int y = p.length;
        int x = p[0].length;
        if (y<2||x<2){
            return 0;
        }
        HashMap<Integer,String > hashMap = new HashMap<>();
        if (y>x){
            k=x;
        }else {
            k=y;
        }
        boolean flag=true;
        while (flag){
            for (int i = 0; i <y; i++) {
                int sum = Arrays.stream(p[i]).sum();
                if (hashMap.containsKey(sum)){
                    String s = hashMap.get(sum);
                    String[] split = s.split("-");
                    Integer ks = Integer.getInteger(split[0]);
                    Integer is = Integer.getInteger(split[1]);
                    if ((i-is)==k){
                        int isum=0;
                        for (int j = is; j <= i; j++) {
                            isum+= p[j][0];

                        }
                        flag=false;
                        break;
                    }
                }else{
                    hashMap.put(sum,k+"-"+i);
                }
            }
            if (!flag){
                k-=1;
            }
        }



        return k;
    }
}
