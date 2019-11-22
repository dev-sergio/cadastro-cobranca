Projeto para Controle de Títulos
=========================
![Spring Boot 2.2.1.RELEASE](https://img.shields.io/badge/Spring%20Boot-2.2.1.RELEASE-brightgreen.svg)
![Mysql 5.6](https://img.shields.io/badge/Mysql-8.0.17-blue.svg)
![JDK 1.8](https://img.shields.io/badge/JDK-12-brightgreen.svg)
![Maven](https://img.shields.io/badge/Maven-3.6.2-brightgreen.svg)

Pequeno projeto realizado através do curso Spring MVC da [Algaworks](https://www.algaworks.com/).
O diferencial dele está nas versões usadas, como está em versão antiga, atualizei por conta própria. 
Atualizado versão do Spring (da 1.3.1.RELEASE para 2.2.1.RELEASE), do JDK(da 1.8 para 12), do Maven e do Bootstrap(da 3 para 4) e feito ajustes também no jQuery e no Thymeleaf.

---

## O PROJETO
Sistema simples, onde há duas paginas responsivas:

**[Titulos*](http://localhost/titulos)**: Página que mostra todos os títulos cadastrados. 
![](https://lh3.googleusercontent.com/jhbEOeG9ibuwJq-2TTc4TEEvfvCv0TiSw36H3J_eQKg2lF4OofJnpOUNZCtpHGqo1xN6O2Re9ELAjmMcj8nbPEhpCpIffvQZG8XgtDtMx25j6EEOVWotXtzcvpIPocMDGD1og9jcAnnkK9DbjytOQYRImN0dlF5ZaXtpWn73Ky-awrEY0FL9pX5QSmKW89KE61cNiqM0BzFwYvL4rL3THwCMS6PuoE8O7eYZ9PWEKYXGPxy8t6sGJbcd9KtyeGfSs79ousYOvLsReq4dw3KJ3oLNcPJ1C8YeGnS-OSpNdtOW91P3qg81L01iKvB0EaeHE1NAnnJoMNFVoVHwaT9SH8IgSFWiCAZfpRRe0D7glTnmxHWE4vbm6Z4CcMs0D2a6QxdTxM7FwxtEIhTzQHyuP_NDMrMTMr1sD-CJfeWPoGsmZCpmzDnRZ8rdZwE0vfIkHl-KZvc8fvOUByKnZJiUtIv-9utbunl9QkOS_GXFHp6m5k5TfS3evgXR2DfbG4bxkQSxJ9p4KDiFLaVm6c4FAlGhV4U-wuGVQAbCpQokCJZ6LQpuflht7mgGl4vYc7beaCdpELthyG4GmrdN8bQqxegL_C9VQJNNx-IMlOM8C9oxPt3Sl4H76aZbdTt-RgoIKdEpvtEFeLd0f_Y5jpIo6Oe84-hUJigvjCQ1OFOiLlM2_5wqZWSkSWw=w1753-h920-no)


**[Novo*](http://localhost/titulos/novo)**: Página para cadastrar novos títulos.
![enter image description here](https://lh3.googleusercontent.com/ZQ_ahftJM4tZpXNCClf6MTyhGSDUPNDOlHpLjRMoF69Opr35Iq9lJ40vomWTWrvHge205cM5pDD3DqcayRspTwviQwENQc0F9ryfLFGtMWnvCgDPEF1XMRKTyO_jvaZrDO4jMA4eXkUAY9UebELrcclY51VPt8zBv4Dvir5-EtExHLdUQonkaijKE_OB3rZP3JBd49v5MPcjxzGKzE8YFUcy3wVavL9DpwxY7oRMG2O0JkV8OVnt98lDg-rgaLgAhu0bav3DF8ss2v3LDWxQ0gQ1FNEcDH-hX9lbg_uOd9QgtL9lVZTxbsjBMtUJEx56hf2mfkZhsIpcRuvl6y2tYu9C8wJJSBYab38snTXJrh_wOb7XwZwp8viKOJXllAnkjGUKdaL-8XD-lP_fjVS0RjorJCvIbq4zHE2suj4wEGRV34JikLId58kVkvbTSE0EdgGDZm1ZCUe64qvxcUKa0DIJvs-FaScJQc1K02I2xvz1D9VLkCBfW_nYe86pAmZBcSbPVmodcNUM9PE2mEKx8Wjzv2OZI-WFZZIH8DUnZ22jZ7-72YCcTvptoSn0uAgDExmQwzzG14EDuPFzN_nH3WZWxG6y3qgYy4nW18PP4feRXXETlwi6PjqyLtcD-kPwbdMQV8mSAmiOuOjdcPVakaWQxj-dlxmwRgaXLH43uQGpxz8RFPaBTMI=w1854-h969-no)
*Dependendo da configuração do seu servidor de aplicação (Adicionar porta do servidor)

-Nesse projeto é possível cadastrar títulos para controle financeiro. 
-Na tela principal estão disponíveis todos os títulos já cadastrados, onde é possível recebe-lo, edita-lo ou exclui-lo, tudo através dos botões adicionados a frente de cada título. 
-Na pagina "titulos/novo" é onde podemos cadastrar novos títulos e edita-los caso necessário. 

-Para persistência dos dados, foi usado banco de dados relacional MySQL da Oracle®.
Então para funcionamento desse projeto, da forma que está, é necessário o client do MySQL rodando na porta 3306 e também o usuário e senha definidos como ***root*** . É gerado automaticamente uma base de dados com o banco chamado *cobranca* e as tabelas conforme o Model. 
___
## CONTATO


<a href="https://github.com/sergio1910">
    <img src="http://pngimg.com/uploads/github/github_PNG20.png" width="55px"></a>
<a href="https://www.linkedin.com/in/sergioluiz-jr/">
    <img src="https://www.sa-cim.fr/izycontenu/uploads/sites/1/logo-linkedin-2.jpg" width="59px"></a>
    <a href="mailto:sergio.ltnj@gmail.com"><img src="https://applebase.net/wp-content/uploads/2017/06/gmail-logo.jpg" width="75px">
    <a href="https://api.whatsapp.com/send?phone=5511997249659"><img src="http://businesscarssrl.it/wp-content/uploads/2018/07/whatsapp-logo-vector-1013x1024.png" width="60px">