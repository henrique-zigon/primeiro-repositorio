peso=float(input("Quanto voce pesa em Kg? (kg)"))

altura=float(input("Quanto voce mede em altura? (m)"))

IMC=peso/(altura**2)
print("O seu IMC é de {:.1f}".format(IMC))
