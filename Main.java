package adapter;

public class Main
{

    public static void main(String[] args)
    {
        // ���й��������ײ������
        TwoPinSoketChina twoPinSoketChina = new TwoPinSoketChina();
        RongYao myRongYao = new RongYao();
        myRongYao.setTwoPinSoket(twoPinSoketChina);
        myRongYao.chargeRequest();

        // Ȼ�����ɻ�ȥ�������Σ�����ĳ�ùݵ�ǽ����ֻ��һ�����ײ���
        ThreePinSoketAmerica threePinSoketAmerica = new ThreePinSoketAmerica();
        testThreePin(threePinSoketAmerica);

        // �Һ�����������������һͷ�嵽���ײ�������һͷת���ɶ��ײ������Ϳ��Ը��ҵ���ҫ�ֻ����
        AmericaAdapter americaAdapter = new AmericaAdapter(threePinSoketAmerica);
        testTwoPin(americaAdapter);

        // ��������ͨ�������������������ղ������
        myRongYao.setTwoPinSoket(americaAdapter);
        myRongYao.chargeRequest();

    }

    static void testTwoPin(TwoPinSoket twoPinSoket)
    {
        twoPinSoket.chargeWithTwoPin();
        System.out.println("��ѹ��" + twoPinSoket.voltage() + "����\n");
    }

    static void testThreePin(ThreePinSoket threePinSoket)
    {
        threePinSoket.chargeWithThreePin();
        System.out.println("��ѹ��" + threePinSoket.voltage() + "����\n");
    }
}