package net.minecraft.src;
/*   1:    */ import java.util.List;
/*   2:    */ 
/*   3:    */ public class cv
/*   4:    */   extends CommandBase
/*   5:    */ {
/*   6:    */   public String c()
/*   7:    */   {
/*   8: 26 */     return "summon";
/*   9:    */   }
/*  10:    */   
/*  11:    */   public int a()
/*  12:    */   {
/*  13: 31 */     return 2;
/*  14:    */   }
/*  15:    */   
/*  16:    */   public String c(ICommandSender paramae)
/*  17:    */   {
/*  18: 36 */     return "commands.summon.usage";
/*  19:    */   }
/*  20:    */   
/*  21:    */   public void a(ICommandSender paramae, String[] paramArrayOfString) throws CommandException
/*  22:    */   {
/*  23: 41 */     if (paramArrayOfString.length < 1) {
/*  24: 42 */       throw new WrongUsageException("commands.summon.usage", new Object[0]);
/*  25:    */     }
/*  26: 45 */     String str = paramArrayOfString[0];
/*  27: 46 */     BlockPosition localdt = paramae.c();
/*  28: 47 */     Vec3 localbrw = paramae.d();
/*  29:    */     
/*  30: 49 */     double d1 = localbrw.x;
/*  31: 50 */     double d2 = localbrw.y;
/*  32: 51 */     double d3 = localbrw.z;
/*  33: 53 */     if (paramArrayOfString.length >= 4)
/*  34:    */     {
/*  35: 54 */       d1 = b(d1, paramArrayOfString[1], true);
/*  36: 55 */       d2 = b(d2, paramArrayOfString[2], false);
/*  37: 56 */       d3 = b(d3, paramArrayOfString[3], true);
/*  38: 57 */       localdt = new BlockPosition(d1, d2, d3);
/*  39:    */     }
/*  40: 60 */     World localaqu = paramae.e();
/*  41: 61 */     if (!localaqu.e(localdt)) {
/*  42: 62 */       throw new CommandException("commands.summon.outOfWorld", new Object[0]);
/*  43:    */     }
/*  44: 66 */     if ("LightningBolt".equals(str))
/*  45:    */     {
/*  46: 67 */       localaqu.c(new ads(localaqu, d1, d2, d3));
/*  47: 68 */       a(paramae, this, "commands.summon.success", new Object[0]);
/*  48: 69 */       return;
/*  49:    */     }
/*  50: 72 */     NBTTagCompound localfn1 = new NBTTagCompound();
/*  51: 73 */     int i = 0;
/*  52:    */     ho localObject1;
/*  53: 74 */     if (paramArrayOfString.length >= 5)
/*  54:    */     {
/*  55: 75 */       localObject1 = a(paramae, paramArrayOfString, 4);
/*  56:    */       try
/*  57:    */       {
/*  58: 77 */         localfn1 = gg.a(((ho)localObject1).c());
/*  59: 78 */         i = 1;
/*  60:    */       }
/*  61:    */       catch (gf localgf)
/*  62:    */       {
/*  63: 80 */         throw new CommandException("commands.summon.tagError", new Object[] { localgf.getMessage() });
/*  64:    */       }
/*  65:    */     }
/*  66: 83 */     localfn1.setString("id", str);
				  Entity localEntity;
/*  67:    */     try
/*  68:    */     {
/*  69: 87 */       localEntity = EntityList.a(localfn1, localaqu);
/*  70:    */     }
/*  71:    */     catch (RuntimeException localRuntimeException)
/*  72:    */     {
/*  73: 89 */       throw new CommandException("commands.summon.failed", new Object[0]);
/*  74:    */     }
/*  75: 92 */     if (localEntity == null) {
/*  76: 93 */       throw new CommandException("commands.summon.failed", new Object[0]);
/*  77:    */     }
/*  78: 96 */     ((Entity)localEntity).setPositionAndAngles(d1, d2, d3, ((Entity)localEntity).yaw, ((Entity)localEntity).pitch);
/*  79: 97 */     if (i == 0) {
/*  80: 99 */       if ((localEntity instanceof EntityMob)) {
/*  81:100 */         ((EntityMob)localEntity).beforeSpawn(localaqu.E(new BlockPosition((Entity)localEntity)), null);
/*  82:    */       }
/*  83:    */     }
/*  84:103 */     localaqu.spawnEntity((Entity)localEntity);
/*  85:    */     
/*  86:    */ 
/*  87:106 */     Entity localObject2 = localEntity;
/*  88:107 */     NBTTagCompound localfn2 = localfn1;
/*  89:108 */     while ((localObject2 != null) && (localfn2.hasKey("Riding", 10)))
/*  90:    */     {
/*  91:109 */       Entity localwv = EntityList.a(localfn2.getCompoundTag("Riding"), localaqu);
/*  92:110 */       if (localwv != null)
/*  93:    */       {
/*  94:111 */         localwv.setPositionAndAngles(d1, d2, d3, localwv.yaw, localwv.pitch);
/*  95:112 */         localaqu.spawnEntity(localwv);
/*  96:113 */         localObject2.mount(localwv);
/*  97:    */       }
/*  98:115 */       localObject2 = localwv;
/*  99:116 */       localfn2 = localfn2.getCompoundTag("Riding");
/* 100:    */     }
/* 101:118 */     a(paramae, this, "commands.summon.success", new Object[0]);
/* 102:    */   }
/* 103:    */   
/* 104:    */   public List<String> a(ICommandSender paramae, String[] paramArrayOfString, BlockPosition paramdt)
/* 105:    */   {
/* 106:124 */     if (paramArrayOfString.length == 1) {
/* 107:125 */       return a(paramArrayOfString, EntityList.b());
/* 108:    */     }
/* 109:126 */     if ((paramArrayOfString.length > 1) && (paramArrayOfString.length <= 4)) {
/* 110:127 */       return a(paramArrayOfString, 1, paramdt);
/* 111:    */     }
/* 112:130 */     return null;
/* 113:    */   }
/* 114:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cv
 * JD-Core Version:    0.7.0.1
 */