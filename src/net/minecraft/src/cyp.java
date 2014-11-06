package net.minecraft.src;
/*  1:   */ import java.util.concurrent.atomic.AtomicInteger;
/*  2:   */ import org.apache.logging.log4j.LogManager;
/*  3:   */ import org.apache.logging.log4j.Logger;
/*  4:   */ 
/*  5:   */ public class cyp
/*  6:   */ {
/*  7:18 */   private static final AtomicInteger a = new AtomicInteger(0);
/*  8:19 */   private static final Logger b = LogManager.getLogger();
			  static AtomicInteger a() {return a;}
			  static Logger b() {return b;}
/*  9:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cyp
 * JD-Core Version:    0.7.0.1
 */