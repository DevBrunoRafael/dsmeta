import logo from '../../assets/logo.svg';

function Header (){
  return(
    <>
      <header>
        <div className="dsmeta-logo-container">
            <img src={logo} alt="DSMeta" />
            <h1>DSMeta</h1>
            <p>
              Desenvolvido por
              <a href="https://www.instagram.com/devbrunorafael"> @devbrunorafael</a>
            </p>
        </div>
      </header>
    </>
  )
}

export default Header;