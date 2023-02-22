class array{
public static void kadanse(int number[]){
int ms=Integer.MIN_VALUE;
int cs=0;
for(int i=0;i<number.length;i++){
cs=cs+number[i];
if(cs<0){
cs=0;
}ms=Math.max(cs,ms);
}
System.out.println(ms);
}

public static void main(String args[]){
int arr[]={1,-2,5,-4};
kadanse(arr);
}
}