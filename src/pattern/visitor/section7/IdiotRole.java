package pattern.visitor.section7;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class IdiotRole implements Role {
    //一个弱智角色,然谁来扮演
    @Override
    public void accept(AbsActor actor) {
        actor.act(this);
    }
}
