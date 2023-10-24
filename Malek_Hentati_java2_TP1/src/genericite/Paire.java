package genericite;

import java.util.ArrayList;
import java.util.List;
public class Paire<t,tt>{

    private List<t> tab = new ArrayList<t>();
    private List<tt> tabv = new ArrayList<tt>();

    public void setTab(t el){
        this.tab.add(el);
    }

    public void setTabv(tt el){
        this.tabv.add(el);
    }

    public List<t> getlist1(){
        return this.tab;
    }

    public List<tt> getlist2(){
        return this.tabv;
    }
}