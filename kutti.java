class Array{
public static void maxusbarray(int arr[]){
int cursum=0;
int maxsum=Integer.MIN_VALUE;
for(int i=0;i<arr.length;i++){
for(int j=i+1;j<arr.length;j++){
cursum=0;
for(int k=i;k<=j;k++){
cursum+=arr[k];
}
System.out.println(cursum);
if(maxsum<cursum){
maxsum=cursum;
}
}
}System.out.println(maxsum);
}
public static void main(String args[]){
int arr[]={1,2,3,4,5};
maxusbarray(arr);
}
}