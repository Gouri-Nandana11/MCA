#include<stdio.h>
#include<stdlib.h>
struct node {
    int data;
    struct node*right;
    struct node*left;
};
struct node*root=NULL,*newnode;
//creation of node
struct node*create(data)
{
   struct node* newnode = (struct node*)malloc(sizeof(struct node));
    newnode->data=data;
    newnode->left=newnode->right=NULL;
    return newnode;
}
//insertion
struct node*insert(struct node* root,int data)
{
if(root==NULL)
{
  return create(data);

}
if(data<root->data)
{
root->left=insert(root->left,data);
return root;
}
if(data>root->data){
    root->right=insert(root->right,data);
    return root;
}
} 
 void inorder(struct node*root)
 {if(root==NULL)
    return root;
    inorder(root->left);
    printf("%d",root->data);
    inorder(root->right);
 }
int main(){
    int choice,value;
    while(1){
        printf("1.insertion \n 2.inorder\n 3.exit\n");
        printf("Enter your choice \n");
        scanf("%d",&choice);
        switch(choice){
            case 1:printf("Enter the value to insert\n");
             scanf("%d",&value);
             root=insert(root,value);
             break;
        
        case 2:inorder(root) ;
    break;
case 3:return 0;
}
    }
}

