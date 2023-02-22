class Array{
public static void maxsum(int numbers[]){
int cs=0;
int ms =Integer.MIN_VALUE;
int prefix[]=new int [numbers.length];
 prefix[0]=numbers[0];
for(int i=1;i<prefix.length;i++){
prefix[i]=prefix[i-1]+numbers[i];
}
for(int i=0;i<numbers.length;i++){
int start=i;
for(int j=i+1;j<numbers.length;j++){
int  end=j;
cs=start==0?prefix[end]:prefix[end]-prefix[start-1];
if(ms<cs){
ms=cs;
}
}
}System.out.println("max sum:"+ms);
}

public static void main(String args[]){
int numbers[]={-4,-5,-6};
maxsum(numbers);

}
}