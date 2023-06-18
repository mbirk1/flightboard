import "../styles/label.css";
export default function Label(props: any) {
    const {text, style}= props;
    return(
        <label className={style}>{text}</label>
    );
}