set.seed(999)
n<-6048

#-----------------Padrão--------------------------------
bom.n<-rbinom(n,1,.85)
class_pg<-factor(bom.n,levels=c(0,1),labels=c("mau","bom"),ordered =TRUE)
data.default<-data.frame(class_pg)
data.default<-data.frame(table(class_pg))
names(data.default) [grep('Freq',names(data.default))]<-'Freq_absoluta'
data.default<-data.frame(id=1:2,data.default)
Freq_relativa<-round(data.default$Freq_absoluta/sum(data.default$Freq_absoluta)*100,2)
Freq_relativa<-data.frame(id=1:2,Freq_relativa)
table_padrão<-data.frame(merge(data.default,Freq_relativa))
barplot(table_padrão$Freq_relativa,xlab= "Tipo de Tomador Crédito",ylab="Frequência_Relativa",col=c("seagreen", "yellowgreen"))
#--------------Parte a se fazer-------------------------
rendaMensal<-abs(round(rnorm(n,1000,5),0))
idade<-abs(round(rnorm(n,23,1),0))
tabelaFinal<-data.frame(class_pg,rendaMensal,idade)
plot(lm(idade~rendaMensal))
