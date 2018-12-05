import java.util.HashMap;
import java.util.Map;

public class Solution929 {
    public static void main(String[] args) {
        String[] strings = new String[]{"fg.r.u.uzj+o.pw@kziczvh.com","r.cyo.g+d.h+b.ja@tgsg.z.com","fg.r.u.uzj+o.f.d@kziczvh.com","r.cyo.g+ng.r.iq@tgsg.z.com","fg.r.u.uzj+lp.k@kziczvh.com","r.cyo.g+n.h.e+n.g@tgsg.z.com","fg.r.u.uzj+k+p.j@kziczvh.com","fg.r.u.uzj+w.y+b@kziczvh.com","r.cyo.g+x+d.c+f.t@tgsg.z.com","r.cyo.g+x+t.y.l.i@tgsg.z.com","r.cyo.g+brxxi@tgsg.z.com","r.cyo.g+z+dr.k.u@tgsg.z.com","r.cyo.g+d+l.c.n+g@tgsg.z.com","fg.r.u.uzj+vq.o@kziczvh.com","fg.r.u.uzj+uzq@kziczvh.com","fg.r.u.uzj+mvz@kziczvh.com","fg.r.u.uzj+taj@kziczvh.com","fg.r.u.uzj+fek@kziczvh.com"};
        System.out.println(new Solution929().numUniqueEmails(strings));
    }

    public int numUniqueEmails(String[] emails) {
        Map<String,Integer> map=new HashMap<>();
        String[] newEmails = new String[emails.length];
        for (int i = 0; i < emails.length; i++) {
            String str = emails[i];
            String[] s = str.split("@");
            //本地域名
            String local = s[0];
            String ip = s[1];
            //去除本地域名的 .
            local=local.replace(".", "");
            if (local.contains("+")) {
                String[] sp = local.split("\\+");
                local = sp[0];
            }
            newEmails[i] = local + "@" + ip;
            map.put(newEmails[i],i);

        }

        return map.size();
    }
}
