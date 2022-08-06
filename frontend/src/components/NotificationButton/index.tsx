import axios from 'axios';
import icon from '../../assets/notification-icon.svg';
import { BASE_URL } from '../../utils/request';
// esse import vai funcionar como se fosse uma variavel, através do import 
// eu vou procurar o que eu quero armazenar e dps eu coloco como atributo 
// da tag... para isso eu uso o {atributo}.

type props = {
  saleId: number;
}

function handleClick(id : number){
  axios(`${BASE_URL}/${id}/notification`)
  .then(Response => {console.log("deu certo")})
}

function NotificationButton({saleId} : props){
  return (
    <div className="dsmeta-red-btn" onClick={() => {handleClick(saleId)}}>
      <img src={icon} alt="Notificar" />
    </div>
  )
}

export default NotificationButton;