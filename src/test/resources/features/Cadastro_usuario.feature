 # language: pt

 Funcionalidade: Cadastro de asuário


   Cenario: Cadastra novo usuario com sucesso
     Dado que estou na tela de cadastro
     Quando eu preencho os campos corretamente
     E clico no botao Cadastrar
     Entao deve exibir uma mensagem de sucesso


   Cenario: Fazer login com sucesso
     Dado que estou na tela de login
     Quando eu preencho os campos
     E clico no botao Login
     Entao devo visualizar uma mensagem de sucesso