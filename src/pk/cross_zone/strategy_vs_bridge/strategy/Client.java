package pk.cross_zone.strategy_vs_bridge.strategy;

/**
 * 策略模式
 *
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class Client {

    public static void main(String[] args) {

        //创建一封TEXT格式的邮件
        MailTemplate m = new TextMail("a@a.com", "b@b.com", "外星人攻击地球了", "结局是外星人被中国人熬汤炖着吃了！");

        //创建一个Mail发送程序
        MailServer mail = new MailServer(m);
        //发送邮件
        mail.sendMail();
    }
}
