/*#include<stdio.h>
int main()
{
    int t,s,a,b,c;
    scanf("%d",&t);
    for(int i=0;i<t;i++)
    {
        scanf("%d %d %d %d",&s,&a,&b,&c);
        int re= ((100/s)*c+s);
        if(a <= re && re <= b)
        {
            printf("%d\n",re);
            printf("Yes\n");
        }
        else{
             printf("%d\n",re);
            printf("No\n");
        }
        
    }
}*/

#include<stdio.h>
int main()
{
    int t,n,k;
    scanf("%d",&t);
    for(int i=0;i<t;i++)
    {
        scanf("%d %d",&n,&k);
        int p = k/n;
        if(p == 1)
        {
            printf("%d\n",p);
        }
        else
        {
         int res = (k * 2) / 2;
        }
    }
}