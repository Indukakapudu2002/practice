import java.util.Scanner;
public class tree
{
    tree left;
    tree right;
    int data;
    public static void main(String args[])
    {

        tree root = creation();
        System.out.println("tree created");
        System.out.println("your binary tree is");
        traversion(root);
    }
    public static tree creation()
    {
        Scanner sc = new Scanner(System.in);
        tree n=new tree();
        System.out.println("enter the data");
        n.data = sc.nextInt();
        System.out.println("you want to create left node press 1");
        int choice = sc.nextInt();
        if (choice == 1)
        {
            n.left=creation();
        }
        System.out.println("do you want to create right node press 1");
        int ch = sc.nextInt();
        if(ch==1)
        {
            n.right=creation();
        }
        return n;
    }
    public static void traversion(tree temp)
    {
        if(temp==null)
        {
            return;
        }

        traversion(temp.left);

        traversion(temp.right);
        System.out.println(temp.data);
        }
    }
