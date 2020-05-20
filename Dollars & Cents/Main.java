    #include <iostream>
    using namespace std;
   
    int NormalizeMoney(int&);
    int main()
    {
        int doll,cent,cents, dollars,sumd=0,sumc=0;
     cin>>doll;
      cin>>cent;
      cin>>dollars;
        cin >> cents;
      doll=doll+ cent/100;cent=cent%100;
      dollars+= cents/100;
        cents = cents % 100;
      
      sumd=doll+dollars;
        sumc = cent+cents;
      if (sumc >=100)
      {sumd+=1;sumc-=100;}
      cout <<sumd<<"\n"<<sumc;
        return 0;
    }
   
       
        
       