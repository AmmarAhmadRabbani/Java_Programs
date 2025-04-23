class PrintUniqueArray{
public static void main(String[] args){

int[] ar={4,3,5,2,2,4,1,6};
for(int i=0;i<ar.length;i++){


for(int j=0;j<ar.length-1;j++){
if(ar[i] ==ar[j+1]){
int temp=ar[i];
ar[i]=ar[j+1];
ar[j+1]=temp;
}
}

for(int i=0;i<ar.length;i++){
System.out.println(ar[i]);
}


}
}


