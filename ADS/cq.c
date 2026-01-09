#include<stdio.h>
#define max 10
int cq[max],val,f, r;

 void enq(int val)
printf("enter the value to insert:\n");
scanf("%d",&val);
{
if(r==max-1 && f==0)||(f==r+1){
printf("overflow\m");
}
 if(f==-1){
r=f=0;
}
if(r=max-1 && f!=0){
r=0;}
else
{
r++;
}
cq[r]=val;
}
  void deq(){
  if(f==-1){
  printf("empty\n");
  return;
  }
  printf("%d deleted",cq[val]);
  if(f==r){
  f=-1;}
  if(f=max-1){
  f=0;}
  else{
  f--;}
  }
   void display(){
   if(f==-1){
   printf("underflow");
   }
   if(r>=f){
   for(int i=f;i<=r;i++ ){
   printf("%d ",cq[i]);}}
   }
   if(int i=f;i<max;i++){
   printf("%d",cq[i]);}
   if(int i=0;i<=r;i++)

