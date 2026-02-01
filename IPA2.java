import java.util.*;

public class solution{
    public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();sc.nextLine();
            FootwearProgram arr[] = new FootwearProgram[n];

            for(int i = 0;i<arr.length;i++){
                int a = sc.nextInt();sc.nextLine();
                String b = sc.nextLine();
                String c = sc.nextLine();
                int d = sc.nextInt();sc.nextLine();

                arr[i] = new FootwearProgram(a, b, c, d);
            }
            String FootwearTypeNeed = sc.nextLine();

            int ans = getCountByType(arr,FootwearTypeNeed);

            if(ans == 0){
                System.out.println("0");
            }
            else System.out.println(ans);
    }

    public static int getCountByType(FootwearProgram arr[], String FootwearTypeNeed){
        int count = 0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i].getfootwearType().equalsIgnoreCase(FootwearTypeNeed)){
                count++;
            }
        }
        return count;
    }
}

class FootwearProgram{
    int footwearId;
    String footwearName;
    String footwearType;
    int price;


public FootwearProgram(int footwearId, String footwearName, String footwearType, int price){
    this.footwearId = footwearId;
    this.footwearName = footwearName;
    this.footwearType = footwearType;
    this.price = price;
}

public int getfootwearId(){
    return footwearId;
}

public String getfootwearName(){
    return footwearName;
}

public String getfootwearType(){
    return footwearType;
}

public int price(){
    return price;
}
}
