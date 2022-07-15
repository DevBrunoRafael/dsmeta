import icon from '../../assets/notification-icon.svg';
// esse import vai funcionar como se fosse uma variavel, através do import 
// eu vou procurar o que eu quero armazenar e dps eu coloco como atributo 
// da tag... para isso eu uso o {atributo}.

function NotificationButton(){
  return (
    <div className="dsmeta-red-btn">
      <img src={icon} alt="Notificar" />
    </div>
  )
}

export default NotificationButton;