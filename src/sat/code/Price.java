package sat.code;

/**
 * Created with IntelliJ IDEA.
 * User: nex
 * Date: 5/18/12
 * Time: 6:51 AM
 * To change this template use File | Settings | File Templates.
 */
public class Price {
    int numberA=0,numberB=0,numberC=0,numberD=0;
    int priceA=50,priceB=30,priceC=20,priceD=15;
    //需要计算折扣，添加各自类别合计
    int sumA=0,sumB=0,sumC=0,sumD=0;
    //根据输入统计各类商品的数量
    public void getNumbers(String items){
        numberA=numberB=numberC=numberD=0;
        for(int i =0;i<items.length();i++){
            switch(items.charAt(i)){
                case 'A': numberA++;break;
                case 'B': numberB++;break;
                case 'C': numberC++;break;
                case 'D': numberD++;break;
                default:break;
            }
        }
    }


    public int sum(String items){
        int sumPrice=sumA=sumB=sumC=sumD=0;
        if(items=="") return sumPrice;

        getNumbers(items);

/*		//计算总价，无折扣时
        //sumPrice=numberA*priceA+numberB*priceB+numberC*priceC+numberD*priceD;
*/
        //分别计算各种价格
        sumA=130*(numberA/3)+priceA*(numberA%3);
        sumB=45*(numberB/2)+priceB*(numberB%2);
        sumC=numberC*priceC;
        sumD=numberD*priceD;

        //计算总价
        sumPrice=sumA+sumB+sumC+sumD;
        return sumPrice;
    }
}
