class Duda:
    def __init__(self, nome, fone, matéria):
        self.nome= nome
        self.fone = fone
        self.matéria = matéria
    def getNome(self):
        return f"Olá, meu nome é: {self.nome}"
    def getMatéria(self):
        return f"OLá, estou estudando: {self.matéria}"
    
duda = Duda("Varlen", "85 998416052", "Geografia")
print(duda.getNome())
print("Nome: ", duda.getNome)
print("Telefone ", duda.fone)
print()
print(duda.getMatéria())    