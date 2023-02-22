class stringlS{
public static int stringlinearsearch(int key,menu[]){
for(int i=0;i<menu.length;i++){
if(menu[i]=key){
return i;
}
}
return -1;
}
public static void main (String args[]){
String menu[]={"dosa","cholebhature","samosa","kachori"};
String key=sc.nextLine();
int index= stringlinearsearch(key,menu);
if(index=-1){
System.out.println("not found");
}else{
System.out.println("found at: "+index);
}
}
}
