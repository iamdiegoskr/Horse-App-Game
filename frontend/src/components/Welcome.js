import React from 'react'

const Welcome = () => {
    return (
        <div className="welcome-container">
            <div className="welcome">
                <img src="/assets/horsebackground2.svg" alt="horse race"/>
                <div className="info">
                    <h2 className="welcome-title">BIENVENIDO</h2>
                    <p className="welcome-text">Bienvenido a este increible juego de carreras</p>
                    <button className="btn-welcome">COMENZAR</button>
                </div>
            </div>
        </div>
    )
}

export default Welcome;
