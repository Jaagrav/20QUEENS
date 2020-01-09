// Created by Jaagrav

import java.util.*;
public class queena
{
        static int a[],s[],d[],n,f=0, range=(int)(Math.floor(Math.random()*300));
static boolean rowch(int row) 
{

if(row==n)
{
    if(f==range)
    display();
    f++;
    return true;
}
int col=0;
for(col=0;col<n;col++) 
{
    int b;
    for(b=0;b<row;b++) 
    {
        if(a[b]==col||s[b]==col+row||d[b]==row-col)
        {
            break;
        }
    }
    if(b!=row)
    {
        continue;
    }
    {     
    a[row]=col; 
    s[row]=row+col;
    d[row]=row-col;
    }
    if(rowch(row+1)==false&&f<=range)
    {
        continue;
    }     
    else break;
}
return false;
}
static void display()
{
    int i,j;
    for(i=0;i<n;i++)
    {
        for(j=0;j<n;j++)
        {
            System.out.print((a[i]==j?1:0)+" ");
        }
        System.out.println("");
    }
}
public static void main(String[] args)
{
    System.out.println("Enter no of rows and columns");
    Scanner sc=new Scanner(System.in);
    n=20;
    a=new int[n];
    s=new int[n];
    d=new int[n];
    for(int i=0;i<n;i++)
    {
        a[i]=0;  
        s[i]=0; 
        d[i]=0; 
    }
    rowch(0);
}
}
