package DynamicArrayAndString;

import java.lang.annotation.ElementType;
import java.util.ArrayList;
import java.util.Scanner;

public class L01P01 {
    /**
     * Theo quy tắc về thời trang của đất nước Berland, tất cả nút trên áo đều phải được cài trừ một nút duy nhất không cần phải cài. Tuy nhiên trong trường hợp đặc biệt với chiếc áo chỉ có đúng một nút thì nút đó phải được cài để áo không bị bay.
     * Bạn được cho một chiếc áo với N nút. Xác định xem áo đã được cài đúng hay chưa.
     *
     * Dữ liệu nhập
     * Dòng đầu tiên chứa một số nguyên
     * (1≤N≤1000) – số lượng nút trên áo.
     *
     Dòng tiếp theo lần lượt chứa N số là đại diện cho nút cài (số 1) hoặc nút không cài (số 0)
     *
     * Dữ liệu xuất
     * In ra YES nếu áo được cài đúng quy tắc, ngược lại in ra NO.
     * **/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++){
            arr.add(scanner.nextInt());
        }
        boolean isValid = valid(arr);
        if(isValid == true){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public static boolean valid(ArrayList<Integer> arr){
        int count = 0;
        if(arr.size() == 1){
            if(arr.get(0) == 1){
                return true;
            }
            return false;
        } else {
            for(int i = 0; i < arr.size(); i++){
                if(arr.get(i) == 0){
                    count++;
                }
            }
            if (count == 1){
                return true;
            } else {
                return false;
            }
        }
    }
}
