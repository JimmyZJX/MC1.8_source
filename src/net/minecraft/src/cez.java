package net.minecraft.src;
/*   1:    */ import com.google.common.base.Splitter;
/*   2:    */ import com.google.common.collect.Lists;

/*   3:    */ import io.netty.bootstrap.Bootstrap;
/*   4:    */ import io.netty.channel.EventLoopGroup;
/*   5:    */ import io.netty.channel.socket.nio.NioSocketChannel;

/*   6:    */ import java.net.InetAddress;
import java.net.UnknownHostException;
/*   7:    */ import java.util.Collections;
/*   8:    */ import java.util.Iterator;
/*   9:    */ import java.util.List;

/*  10:    */ import org.apache.logging.log4j.LogManager;
/*  11:    */ import org.apache.logging.log4j.Logger;
/*  12:    */ 
/*  13:    */ public class cez
/*  14:    */ {
/*  15: 35 */   private static final Splitter a = Splitter.on('\000').limit(6);
/*  16: 36 */   private static final Logger b = LogManager.getLogger();
/*  17: 38 */   private final List c = Collections.synchronizedList(Lists.newArrayList());
/*  18:    */   
/*  19:    */   public void a(cew paramcew) throws UnknownHostException
/*  20:    */   {
/*  21: 41 */     cev localcev = cev.a(paramcew.b);
/*  22: 42 */     gr localgr = gr.a(InetAddress.getByName(localcev.a()), localcev.b());
/*  23:    */     
/*  24: 44 */     this.c.add(localgr);
/*  25:    */     
/*  26: 46 */     paramcew.d = "Pinging...";
/*  27: 47 */     paramcew.e = -1L;
/*  28: 48 */     paramcew.i = null;
/*  29:    */     
/*  30: 50 */     localgr.a(new cfa(this, paramcew, localgr));
/*  31:    */     try
/*  32:    */     {
/*  33:137 */       localgr.a(new mz(47, localcev.a(), localcev.b(), gy.c));
/*  34:138 */       localgr.a(new nx());
/*  35:    */     }
/*  36:    */     catch (Throwable localThrowable)
/*  37:    */     {
/*  38:140 */       b.error(localThrowable);
/*  39:    */     }
/*  40:    */   }
/*  41:    */   
/*  42:    */   private void b(cew paramcew)
/*  43:    */   {
/*  44:145 */     cev localcev = cev.a(paramcew.b);
/*  45:    */     
/*  46:147 */     ((Bootstrap)((Bootstrap)((Bootstrap)new Bootstrap().group((EventLoopGroup)gr.d.c())).handler(new cfb(this, localcev, paramcew))).channel(NioSocketChannel.class)).connect(localcev.a(), localcev.b());
/*  47:    */   }
/*  48:    */   
/*  49:    */   public void a()
/*  50:    */   {
/*  51:232 */     synchronized (this.c)
/*  52:    */     {
/*  53:233 */       Iterator localIterator = this.c.iterator();
/*  54:234 */       while (localIterator.hasNext())
/*  55:    */       {
/*  56:235 */         gr localgr = (gr)localIterator.next();
/*  57:237 */         if (localgr.g())
/*  58:    */         {
/*  59:238 */           localgr.a();
/*  60:    */         }
/*  61:    */         else
/*  62:    */         {
/*  63:240 */           localIterator.remove();
/*  64:241 */           localgr.l();
/*  65:    */         }
/*  66:    */       }
/*  67:    */     }
/*  68:    */   }
/*  69:    */   
/*  70:    */   public void b()
/*  71:    */   {
/*  72:248 */     synchronized (this.c)
/*  73:    */     {
/*  74:249 */       Iterator localIterator = this.c.iterator();
/*  75:250 */       while (localIterator.hasNext())
/*  76:    */       {
/*  77:251 */         gr localgr = (gr)localIterator.next();
/*  78:253 */         if (localgr.g())
/*  79:    */         {
/*  80:254 */           localIterator.remove();
/*  81:255 */           localgr.a(new hy("Cancelled"));
/*  82:    */         }
/*  83:    */       }
/*  84:    */     }
/*  85:    */   }
				static Logger c() {return b;}
				static void a(cez paramcez, cew paramcew) {paramcez.b(paramcew);}
				static Splitter d() {return a;}
/*  86:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cez
 * JD-Core Version:    0.7.0.1
 */