package net.minecraft.src;
/*   1:    */ import com.google.common.collect.Lists;
/*   2:    */ import java.util.ArrayList;
/*   3:    */ import java.util.Iterator;
/*   4:    */ import java.util.List;
/*   5:    */ import java.util.Set;
/*   6:    */ import tv.twitch.chat.ChatUserInfo;
/*   7:    */ import tv.twitch.chat.ChatUserMode;
/*   8:    */ import tv.twitch.chat.ChatUserSubscription;
/*   9:    */ 
/*  10:    */ public class can
/*  11:    */   extends bxf
/*  12:    */ {
/*  13: 26 */   private static final a a = net.minecraft.src.a.c;
/*  14: 27 */   private static final a f = net.minecraft.src.a.m;
/*  15: 28 */   private static final a g = net.minecraft.src.a.f;
/*  16:    */   private final ChatUserInfo h;
/*  17:    */   private final ho i;
/*  18: 33 */   private final List<ho> r = Lists.newArrayList();
/*  19:    */   private final dao s;
/*  20:    */   private int t;
/*  21:    */   
/*  22:    */   public can(dao paramdao, ChatUserInfo paramChatUserInfo)
/*  23:    */   {
/*  24: 38 */     this.s = paramdao;
/*  25: 39 */     this.h = paramChatUserInfo;
/*  26:    */     
/*  27: 41 */     this.i = new hy(paramChatUserInfo.displayName);
/*  28:    */     
/*  29: 43 */     this.r.addAll(a(paramChatUserInfo.modes, paramChatUserInfo.subscriptions, paramdao));
/*  30:    */   }
/*  31:    */   
/*  32:    */   public static List<hy> a(Set<ChatUserMode> paramSet1, Set<ChatUserSubscription> paramSet2, dao paramdao)
/*  33:    */   {
/*  34: 47 */     String str = paramdao == null ? null : paramdao.z();
/*  35: 48 */     boolean bool = (paramdao != null) && (paramdao.y());
/*  36: 49 */     ArrayList<hy> localArrayList = Lists.newArrayList();
/*  37: 51 */     for (Iterator<ChatUserMode> localIterator = paramSet1.iterator(); localIterator.hasNext();)
/*  38:    */     {
/*  39: 51 */       ChatUserMode localObject = (ChatUserMode)localIterator.next();
/*  40: 52 */       ho localho = a((ChatUserMode)localObject, str, bool);
/*  41: 54 */       if (localho != null)
/*  42:    */       {
/*  43: 55 */         hy localhy = new hy("- ");
/*  44: 56 */         localhy.a(localho);
/*  45: 57 */         localArrayList.add(localhy);
/*  46:    */       }
/*  47:    */     }
/*  48:    */     Object localObject;
/*  49:    */     ho localho;
/*  50:    */     hy localhy;
/*  51: 61 */     for (Iterator<ChatUserSubscription> localIterator = paramSet2.iterator(); localIterator.hasNext();)
/*  52:    */     {
/*  53: 61 */       localObject = (ChatUserSubscription)localIterator.next();
/*  54: 62 */       localho = a((ChatUserSubscription)localObject, str, bool);
/*  55: 64 */       if (localho != null)
/*  56:    */       {
/*  57: 65 */         localhy = new hy("- ");
/*  58: 66 */         localhy.a(localho);
/*  59: 67 */         localArrayList.add(localhy);
/*  60:    */       }
/*  61:    */     }
/*  62: 71 */     return localArrayList;
/*  63:    */   }
/*  64:    */   
/*  65:    */   public static ho a(ChatUserSubscription paramChatUserSubscription, String paramString, boolean paramBoolean)
/*  66:    */   {
/*  67: 75 */     hz localhz = null;
/*  68: 77 */     if (paramChatUserSubscription == ChatUserSubscription.TTV_CHAT_USERSUB_SUBSCRIBER)
/*  69:    */     {
/*  70: 78 */       if (paramString == null) {
/*  71: 79 */         localhz = new hz("stream.user.subscription.subscriber", new Object[0]);
/*  72: 80 */       } else if (paramBoolean) {
/*  73: 81 */         localhz = new hz("stream.user.subscription.subscriber.self", new Object[0]);
/*  74:    */       } else {
/*  75: 83 */         localhz = new hz("stream.user.subscription.subscriber.other", new Object[] { paramString });
/*  76:    */       }
/*  77: 85 */       localhz.b().a(a);
/*  78:    */     }
/*  79: 86 */     else if (paramChatUserSubscription == ChatUserSubscription.TTV_CHAT_USERSUB_TURBO)
/*  80:    */     {
/*  81: 87 */       localhz = new hz("stream.user.subscription.turbo", new Object[0]);
/*  82: 88 */       localhz.b().a(g);
/*  83:    */     }
/*  84: 91 */     return localhz;
/*  85:    */   }
/*  86:    */   
/*  87:    */   public static ho a(ChatUserMode paramChatUserMode, String paramString, boolean paramBoolean)
/*  88:    */   {
/*  89: 95 */     hz localhz = null;
/*  90: 97 */     if (paramChatUserMode == ChatUserMode.TTV_CHAT_USERMODE_ADMINSTRATOR)
/*  91:    */     {
/*  92: 98 */       localhz = new hz("stream.user.mode.administrator", new Object[0]);
/*  93: 99 */       localhz.b().a(g);
/*  94:    */     }
/*  95:100 */     else if (paramChatUserMode == ChatUserMode.TTV_CHAT_USERMODE_BANNED)
/*  96:    */     {
/*  97:101 */       if (paramString == null) {
/*  98:102 */         localhz = new hz("stream.user.mode.banned", new Object[0]);
/*  99:103 */       } else if (paramBoolean) {
/* 100:104 */         localhz = new hz("stream.user.mode.banned.self", new Object[0]);
/* 101:    */       } else {
/* 102:106 */         localhz = new hz("stream.user.mode.banned.other", new Object[] { paramString });
/* 103:    */       }
/* 104:108 */       localhz.b().a(f);
/* 105:    */     }
/* 106:109 */     else if (paramChatUserMode == ChatUserMode.TTV_CHAT_USERMODE_BROADCASTER)
/* 107:    */     {
/* 108:110 */       if (paramString == null) {
/* 109:111 */         localhz = new hz("stream.user.mode.broadcaster", new Object[0]);
/* 110:112 */       } else if (paramBoolean) {
/* 111:113 */         localhz = new hz("stream.user.mode.broadcaster.self", new Object[0]);
/* 112:    */       } else {
/* 113:115 */         localhz = new hz("stream.user.mode.broadcaster.other", new Object[0]);
/* 114:    */       }
/* 115:117 */       localhz.b().a(a);
/* 116:    */     }
/* 117:118 */     else if (paramChatUserMode == ChatUserMode.TTV_CHAT_USERMODE_MODERATOR)
/* 118:    */     {
/* 119:119 */       if (paramString == null) {
/* 120:120 */         localhz = new hz("stream.user.mode.moderator", new Object[0]);
/* 121:121 */       } else if (paramBoolean) {
/* 122:122 */         localhz = new hz("stream.user.mode.moderator.self", new Object[0]);
/* 123:    */       } else {
/* 124:124 */         localhz = new hz("stream.user.mode.moderator.other", new Object[] { paramString });
/* 125:    */       }
/* 126:126 */       localhz.b().a(a);
/* 127:    */     }
/* 128:127 */     else if (paramChatUserMode == ChatUserMode.TTV_CHAT_USERMODE_STAFF)
/* 129:    */     {
/* 130:128 */       localhz = new hz("stream.user.mode.staff", new Object[0]);
/* 131:129 */       localhz.b().a(g);
/* 132:    */     }
/* 133:132 */     return localhz;
/* 134:    */   }
/* 135:    */   
/* 136:    */   public void b()
/* 137:    */   {
/* 138:138 */     int j = this.l / 3;
/* 139:139 */     int k = j - 130;
/* 140:140 */     this.n.add(new bug(1, j * 0 + k / 2, this.m - 70, 130, 20, cwc.a("stream.userinfo.timeout", new Object[0])));
/* 141:141 */     this.n.add(new bug(0, j * 1 + k / 2, this.m - 70, 130, 20, cwc.a("stream.userinfo.ban", new Object[0])));
/* 142:142 */     this.n.add(new bug(2, j * 2 + k / 2, this.m - 70, 130, 20, cwc.a("stream.userinfo.mod", new Object[0])));
/* 143:    */     
/* 144:144 */     this.n.add(new bug(5, j * 0 + k / 2, this.m - 45, 130, 20, cwc.a("gui.cancel", new Object[0])));
/* 145:145 */     this.n.add(new bug(3, j * 1 + k / 2, this.m - 45, 130, 20, cwc.a("stream.userinfo.unban", new Object[0])));
/* 146:146 */     this.n.add(new bug(4, j * 2 + k / 2, this.m - 45, 130, 20, cwc.a("stream.userinfo.unmod", new Object[0])));
/* 147:    */     
/* 148:148 */     int m = 0;
/* 149:149 */     for (ho localho : this.r) {
/* 150:150 */       m = Math.max(m, this.q.a(localho.d()));
/* 151:    */     }
/* 152:152 */     this.t = (this.l / 2 - m / 2);
/* 153:    */   }
/* 154:    */   
/* 155:    */   protected void a(bug parambug)
/* 156:    */   {
/* 157:157 */     if (!parambug.l) {
/* 158:158 */       return;
/* 159:    */     }
/* 160:161 */     if (parambug.k == 0) {
/* 161:162 */       this.s.f("/ban " + this.h.displayName);
/* 162:163 */     } else if (parambug.k == 3) {
/* 163:164 */       this.s.f("/unban " + this.h.displayName);
/* 164:165 */     } else if (parambug.k == 2) {
/* 165:166 */       this.s.f("/mod " + this.h.displayName);
/* 166:167 */     } else if (parambug.k == 4) {
/* 167:168 */       this.s.f("/unmod " + this.h.displayName);
/* 168:169 */     } else if (parambug.k == 1) {
/* 169:170 */       this.s.f("/timeout " + this.h.displayName);
/* 170:    */     }
/* 171:173 */     this.j.a((bxf)null);
/* 172:    */   }
/* 173:    */   
/* 174:    */   public void a(int paramInt1, int paramInt2, float paramFloat)
/* 175:    */   {
/* 176:178 */     c();
/* 177:    */     
/* 178:180 */     a(this.q, this.i.c(), this.l / 2, 70, 16777215);
/* 179:    */     
/* 180:182 */     int j = 80;
/* 181:183 */     for (ho localho : this.r)
/* 182:    */     {
/* 183:184 */       c(this.q, localho.d(), this.t, j, 16777215);
/* 184:185 */       j += this.q.a;
/* 185:    */     }
/* 186:188 */     super.a(paramInt1, paramInt2, paramFloat);
/* 187:    */   }
/* 188:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     can
 * JD-Core Version:    0.7.0.1
 */