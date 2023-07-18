import java.util.*;
class prime
{
public static void main(String args[])
{
int count=0;
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();

for(int i=1;i<=n;i++){
for(int j=1;j<=i;j++){
if(i%j==0){
count=count+1;
}}
if(count==2){
System.out.println(i);
}
else {
count=0;
}
}
}
}
