package net.minecraft.src;
/*   1:    */ import java.util.Collection;
/*   2:    */ import java.util.UUID;
/*   3:    */ import org.apache.logging.log4j.LogManager;
/*   4:    */ import org.apache.logging.log4j.Logger;
/*   5:    */ 
/*   6:    */ public class afs
/*   7:    */ {
/*   8: 14 */   private static final Logger f = LogManager.getLogger();
/*   9: 15 */   public static final xy a = new yg(null, "generic.maxHealth", 20.0D, 0.0D, 1.7976931348623157E+308D).a("Max Health").a(true);
/*  10: 16 */   public static final xy b = new yg(null, "generic.followRange", 32.0D, 0.0D, 2048.0D).a("Follow Range");
/*  11: 17 */   public static final xy c = new yg(null, "generic.knockbackResistance", 0.0D, 0.0D, 1.0D).a("Knockback Resistance");
/*  12: 18 */   public static final xy d = new yg(null, "generic.movementSpeed", 0.699999988079071D, 0.0D, 1.7976931348623157E+308D).a("Movement Speed").a(true);
/*  13: 19 */   public static final xy e = new yg(null, "generic.attackDamage", 2.0D, 0.0D, 1.7976931348623157E+308D);
/*  14:    */   
/*  15:    */   public static fv a(yc paramyc)
/*  16:    */   {
/*  17: 22 */     fv localfv = new fv();
/*  18: 24 */     for (xz localxz : paramyc.a()) {
/*  19: 25 */       localfv.a(a(localxz));
/*  20:    */     }
/*  21: 28 */     return localfv;
/*  22:    */   }
/*  23:    */   
/*  24:    */   private static NBTTagCompound a(xz paramxz)
/*  25:    */   {
/*  26: 32 */     NBTTagCompound localfn = new NBTTagCompound();
/*  27: 33 */     xy localxy = paramxz.a();
/*  28:    */     
/*  29: 35 */     localfn.setString("Name", localxy.a());
/*  30: 36 */     localfn.setDouble("Base", paramxz.b());
/*  31:    */     
/*  32: 38 */     Collection<ya> localCollection = paramxz.c();
/*  33: 40 */     if ((localCollection != null) && (!localCollection.isEmpty()))
/*  34:    */     {
/*  35: 41 */       fv localfv = new fv();
/*  36: 43 */       for (ya localya : localCollection) {
/*  37: 44 */         if (localya.e()) {
/*  38: 45 */           localfv.a(a(localya));
/*  39:    */         }
/*  40:    */       }
/*  41: 49 */       localfn.setNBT("Modifiers", localfv);
/*  42:    */     }
/*  43: 52 */     return localfn;
/*  44:    */   }
/*  45:    */   
/*  46:    */   private static NBTTagCompound a(ya paramya)
/*  47:    */   {
/*  48: 56 */     NBTTagCompound localfn = new NBTTagCompound();
/*  49:    */     
/*  50: 58 */     localfn.setString("Name", paramya.b());
/*  51: 59 */     localfn.setDouble("Amount", paramya.d());
/*  52: 60 */     localfn.setInt("Operation", paramya.c());
/*  53: 61 */     localfn.a("UUIDMost", paramya.a().getMostSignificantBits());
/*  54: 62 */     localfn.a("UUIDLeast", paramya.a().getLeastSignificantBits());
/*  55:    */     
/*  56: 64 */     return localfn;
/*  57:    */   }
/*  58:    */   
/*  59:    */   public static void a(yc paramyc, fv paramfv)
/*  60:    */   {
/*  61: 68 */     for (int i = 0; i < paramfv.c(); i++)
/*  62:    */     {
/*  63: 69 */       NBTTagCompound localfn = paramfv.b(i);
/*  64: 70 */       xz localxz = paramyc.a(localfn.getString("Name"));
/*  65: 72 */       if (localxz != null) {
/*  66: 73 */         a(localxz, localfn);
/*  67:    */       } else {
/*  68: 75 */         f.warn("Ignoring unknown attribute '" + localfn.getString("Name") + "'");
/*  69:    */       }
/*  70:    */     }
/*  71:    */   }
/*  72:    */   
/*  73:    */   private static void a(xz paramxz, NBTTagCompound paramfn)
/*  74:    */   {
/*  75: 81 */     paramxz.a(paramfn.i("Base"));
/*  76: 83 */     if (paramfn.hasKey("Modifiers", 9))
/*  77:    */     {
/*  78: 84 */       fv localfv = paramfn.c("Modifiers", 10);
/*  79: 86 */       for (int i = 0; i < localfv.c(); i++)
/*  80:    */       {
/*  81: 87 */         ya localya1 = a(localfv.b(i));
/*  82: 88 */         if (localya1 != null)
/*  83:    */         {
/*  84: 91 */           ya localya2 = paramxz.a(localya1.a());
/*  85: 92 */           if (localya2 != null) {
/*  86: 93 */             paramxz.c(localya2);
/*  87:    */           }
/*  88: 95 */           paramxz.b(localya1);
/*  89:    */         }
/*  90:    */       }
/*  91:    */     }
/*  92:    */   }
/*  93:    */   
/*  94:    */   public static ya a(NBTTagCompound paramfn)
/*  95:    */   {
/*  96:101 */     UUID localUUID = new UUID(paramfn.getLong("UUIDMost"), paramfn.getLong("UUIDLeast"));
/*  97:    */     try
/*  98:    */     {
/*  99:103 */       return new ya(localUUID, paramfn.getString("Name"), paramfn.i("Amount"), paramfn.getInteger("Operation"));
/* 100:    */     }
/* 101:    */     catch (Exception localException)
/* 102:    */     {
/* 103:105 */       f.warn("Unable to create attribute: " + localException.getMessage());
/* 104:    */     }
/* 105:106 */     return null;
/* 106:    */   }
/* 107:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     afs
 * JD-Core Version:    0.7.0.1
 */